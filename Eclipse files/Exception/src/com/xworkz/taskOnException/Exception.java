package com.xworkz.taskOnException;

import java.awt.AWTError;
import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.geom.IllegalPathStateException;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.image.ImagingOpException;
import java.beans.PropertyVetoException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.channels.UnsupportedAddressTypeException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.rmi.activation.ActivationException;
import java.rmi.server.ServerNotActiveException;
import java.security.GeneralSecurityException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.cert.CertificateException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.MissingResourceException;
import java.util.ServiceConfigurationError;
import java.util.concurrent.TimeoutException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;
import java.util.zip.ZipError;

import javax.lang.model.type.MirroredTypeException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.IntrospectionException;
import javax.management.InvalidApplicationException;
import javax.management.JMRuntimeException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.RefreshFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.portable.ApplicationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

public class Exception {
	// runtimeException
	public void method1() {
		System.out.println("Running method");
		throw new RuntimeException();
	}

	public void method2() {
		System.out.println("Running method2");
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void method3() {
		System.out.println("Running method3");
		throw new ArithmeticException();
	}

	public void method4() {
		System.out.println("Running method4");
		throw new ArrayStoreException();
	}

	public void method5() {
		System.out.println("Running method5");
		throw new BufferOverflowException();
	}

	public void method6() {
		System.out.println("Running method6");
		throw new BufferUnderflowException();
	}

	public void method7() {
		System.out.println("Running method7");
		throw new CannotRedoException();
	}

	public void method8() {
		System.out.println("Running method8");
		throw new ClassCastException();
	}

	public void method9() {
		System.out.println("Running method9");
		throw new CannotUndoException();
	}

	public void method10() {
		System.out.println("Running method10");
		throw new CMMException(null);
	}

	public void method11() {
		System.out.println("Running method11");
		throw new ConcurrentModificationException();
	}

	public void method12() {
		System.out.println("Running method12");
		throw new DOMException((short) 0, null);
	}

	public void method13() {
		System.out.println("Running method13");
		throw new EmptyStackException();
	}

	public void method14() {
		System.out.println("Running method14");
		throw new EnumConstantNotPresentException(null, null);
	}

	public void method15() {
		System.out.println("Running method15");
		throw new EventException((short) 0, null);
	}

	public void method16() {
		System.out.println("Running method16");
		throw new FileSystemAlreadyExistsException();
	}

	public void method17() {
		System.out.println("Running method17");
		throw new FileSystemNotFoundException();
	}

	public void method18() {
		System.out.println("Running method18");
		throw new IllegalArgumentException();
	}

	public void method19() {
		System.out.println("Running method19");
		throw new IllegalMonitorStateException();
	}

	public void method20() {
		System.out.println("Running method20");
		throw new IllegalPathStateException();
	}

	public void method21() {
		System.out.println("Running method21");
		throw new IllegalStateException();
	}

	public void method22() {
		System.out.println("Running method22");
		throw new IllformedLocaleException();
	}

	public void method23() {
		System.out.println("Running method23");
		throw new ImagingOpException(null);
	}

	public void method24() {
		System.out.println("Running method24");
		throw new IncompleteAnnotationException(null, null);
	}

	public void method25() {
		System.out.println("Running method25");
		throw new IndexOutOfBoundsException();
	}

	public void method26() {
		System.out.println("Running method26");
		throw new JMRuntimeException();
	}

	public void method27() {
		System.out.println("Running method27");
		throw new LSException((short) 0, null);
	}

	public void method28() {
		System.out.println("Running method28");
		throw new MalformedParameterizedTypeException();
	}

	public void method29() {
		System.out.println("Running method29");
		throw new MirroredTypeException(null);
	}

	public void method30() {
		System.out.println("Running method30");
		throw new MissingResourceException(null, null, null);
	}

	public void method31() {
		System.out.println("Running method31");
		throw new NegativeArraySizeException();
	}

	public void method32() {
		System.out.println("Running method32");
		throw new TypeNotPresentException(null, null);
	}

	public void method33() {
		System.out.println("Running method33");
		throw new WrongMethodTypeException();
	}

	public void method34() {
		System.out.println("Running method34");
		throw new UnsupportedAddressTypeException();
	}

	public void method35() {
		System.out.println("Running method35");
		throw new SecurityException();
	}

	// exception

	public void method36() throws AclNotFoundException {
		System.out.println("Running method36");
		throw new AclNotFoundException();
	}

	public void method37() throws ActivationException {
		System.out.println("Running method37");
		throw new ActivationException();
	}

	public void method38() throws AlreadyBoundException {
		System.out.println("Running method38");
		throw new AlreadyBoundException();
	}

	public void method39() throws ApplicationException {
		System.out.println("Running method39");
		throw new ApplicationException(null, null);
	}

	public void method40() throws AWTException {
		System.out.println("Running method40");
		throw new AWTException(null);
	}

	public void method41() throws BackingStoreException {
		System.out.println("Running method41");
		throw new BackingStoreException("xyz");
	}

	public void method42() throws BadAttributeValueExpException {
		System.out.println("Running method42");
		throw new BadAttributeValueExpException(null);
	}

	public void method43() throws BadBinaryOpValueExpException {
		System.out.println("Running method43");
		throw new BadBinaryOpValueExpException(null);
	}

	public void method44() throws BadLocationException {
		System.out.println("Running method44");
		throw new BadLocationException(null, 0);
	}

	public void method45() throws ReflectiveOperationException {
		System.out.println("Running method45");
		throw new ReflectiveOperationException();
	}

	public void method46() throws NamingException {
		System.out.println("Running method46");
		throw new NamingException();
	}

	public void method47() throws NoninvertibleTransformException {
		System.out.println("Running method47");
		throw new NoninvertibleTransformException(null);
	}

	public void method48() throws RefreshFailedException {
		System.out.println("Running method48");
		throw new RefreshFailedException();
	}

	public void method49() throws DestroyFailedException {
		System.out.println("Running method49");
		throw new DestroyFailedException();
	}

	public void method50() throws DataFormatException {
		System.out.println("Running method50");
		throw new DataFormatException();
	}

	public void method51() throws CloneNotSupportedException {
		System.out.println("Running method51");
		throw new CloneNotSupportedException();
	}

	public void method52() throws CertificateException {
		System.out.println("Running method52");
		throw new CertificateException();
	}

	public void method53() throws ExpandVetoException {
		System.out.println("Running method53");
		throw new ExpandVetoException(null);
	}

	public void method54() throws FontFormatException {
		System.out.println("Running method54");
		throw new FontFormatException(null);
	}

	public void method55() throws GeneralSecurityException {
		System.out.println("Running method55");
		throw new GeneralSecurityException();
	}

	public void method56() throws GSSException {
		System.out.println("Running method56");
		throw new GSSException(0);
	}

	public void method57() throws IllegalClassFormatException {
		System.out.println("Running method57");
		throw new IllegalClassFormatException();
	}

	public void method58() throws InterruptedException {
		System.out.println("Running method58");
		throw new InterruptedException();
	}

	public void method59() throws IntrospectionException {
		System.out.println("Running method59");
		throw new IntrospectionException();
	}

	public void method60() throws InvalidApplicationException {
		System.out.println("Running method60");
		throw new InvalidApplicationException(null);
	}

	public void method61() throws InvalidMidiDataException {
		System.out.println("Running method61");
		throw new InvalidMidiDataException();
	}

	public void method62() throws InvalidPreferencesFormatException {
		System.out.println("Running method62");
		throw new InvalidPreferencesFormatException(null, null);
	}

	public void method63() throws InvalidTargetObjectTypeException {
		System.out.println("Running method63");
		throw new InvalidTargetObjectTypeException();
	}

	public void method64() throws IOException {
		System.out.println("Running method64");
		throw new IOException();
	}

	public void method65() throws KeySelectorException {
		System.out.println("Running method65");
		throw new KeySelectorException();
	}

	public void method66() throws LastOwnerException {
		System.out.println("Running method66");
		throw new LastOwnerException();
	}

	public void method67() throws LineUnavailableException {
		System.out.println("Running method67");
		throw new LineUnavailableException();
	}

	public void method68() throws PropertyVetoException {
		System.out.println("Running method68");
		throw new PropertyVetoException(null, null);
	}

	public void method69() throws ServerNotActiveException {
		System.out.println("Running method69");
		throw new ServerNotActiveException();
	}

	public void method70() throws TimeoutException {
		System.out.println("Running method70");
		throw new TimeoutException();
	}

	//Error
	
	public void method71() throws AnnotationFormatError {
		System.out.println("Running method71");
		throw new AnnotationFormatError(null, null);
	}

	public void method72() throws AssertionError {
		System.out.println("Running method72");
		throw new AssertionError();
	}

	public void method73() throws AWTError {
		System.out.println("Running method73");
		throw new AWTError(null);
	}

	public void method74() throws CoderMalfunctionError {
		System.out.println("Running method74");
		throw new CoderMalfunctionError(null);
	}

	public void method75() throws FactoryConfigurationError {
		System.out.println("Running method75");
		throw new FactoryConfigurationError();
	}

	public void method76() throws FactoryConfigurationError {
		System.out.println("Running method76");
		throw new FactoryConfigurationError(null, null);
	}

	public void method77() throws IOError {
		System.out.println("Running method77");
		throw new IOError(null);
	}

	public void method78() throws LinkageError {
		System.out.println("Running method78");
		throw new LinkageError();
	}

	public void method79() throws ServiceConfigurationError {
		System.out.println("Running method79");
		throw new ServiceConfigurationError(null);
	}

	public void method80() throws ThreadDeath {
		System.out.println("Running method80");
		throw new ThreadDeath();
	}

	public void method81() throws TransformerFactoryConfigurationError {
		System.out.println("Running method81");
		throw new TransformerFactoryConfigurationError();
	}

	public void method82() throws VirtualMachineError {
		System.out.println("Running method82");
		throw new VirtualMachineError() {
			private static final long serialVersionUID = 1L;
		};
	}

	public void method83() throws InternalError {
		System.out.println("Running method83");
		throw new InternalError();
	}

	public void method84() throws ZipError {
		System.out.println("Running method84");
		throw new ZipError(null);
	}

	public void method85() throws OutOfMemoryError {
		System.out.println("Running method85");
		throw new OutOfMemoryError();
	}

	public void method86() throws StackOverflowError {
		System.out.println("Running method86");
		throw new StackOverflowError();
	}

	public void method87() throws UnknownError {
		System.out.println("Running method87");
		throw new UnknownError();
	}

}